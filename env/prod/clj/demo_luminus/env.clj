(ns demo-luminus.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[demo-luminus started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[demo-luminus has shut down successfully]=-"))
   :middleware identity})
