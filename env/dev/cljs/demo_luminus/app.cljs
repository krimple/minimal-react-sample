(ns ^:figwheel-no-load demo-luminus.app
  (:require [demo-luminus.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
