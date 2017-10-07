(ns demo-luminus.app
  (:require [demo-luminus.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
