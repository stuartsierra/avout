(ns avout.state)


;; shared protocols

(defprotocol Identity
  (getName [this])
  (init [this])
  (destroy [this]))

(defprotocol StateContainer
  (getState [this])
  (setState [this value]))

(defprotocol VersionedStateContainer
  (getStateAt [this version])
  (setStateAt [this value version]))

(defprotocol StateCache
  (setCache [this value])
  (getCache [this])
  (invalidateCache [this]))