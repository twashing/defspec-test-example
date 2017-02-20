(ns defspec-test-example.core
  (:require [clojure.spec :as s]
            [clojure.spec.test :as stest]))


(defn average [list-sum list-count]
  (/ list-sum list-count))

(s/fdef average
        :args (s/and (s/cat :list-sum float? :list-count integer?)
                     #(not (zero? (:list-count %))))
        :ret number?)


