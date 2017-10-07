(ns demo-luminus.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [demo-luminus.core-test]))

(doo-tests 'demo-luminus.core-test)

