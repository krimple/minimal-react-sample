(ns user
  (:require 
            [mount.core :as mount]
            [demo-luminus.figwheel :refer [start-fw stop-fw cljs]]
            demo-luminus.core))

(defn start []
  (mount/start-without #'demo-luminus.core/repl-server))

(defn stop []
  (mount/stop-except #'demo-luminus.core/repl-server))

(defn restart []
  (stop)
  (start))


