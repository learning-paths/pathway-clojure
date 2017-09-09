(ns reading-clojure)


3


(def i-am-a-symbol)             ; 'interned' as a var in the current namespace
;; => #'reading-clojure/i-am-a-symbol


(def i-am-a-vector [3 18 5])    ; an ordered collection of values



i-am-a-vector


(def vector-of-forms ["abc" 77 \a nil true false :a ::a '(:x :y :z) [:q :r :s] {:a 1, :b 2} #{:a :b :c} i-am-a-symbol])


(type 3)
;; => java.lang.Long


(map type vector-of-forms)
;; => (java.lang.String java.lang.Long java.lang.Character nil java.lang.Boolean java.lang.Boolean clojure.lang.Keyword clojure.lang.Keyword clojure.lang.PersistentList clojure.lang.PersistentVector clojure.lang.PersistentArrayMap clojure.lang.PersistentHashSet clojure.lang.Var$Unbound)


(defn value-type-pair [v]
  [v (type v)])


(value-type-pair 77)
;; => [77 java.lang.Long]


(def value-type-pairs (map value-type-pair vector-of-forms))


value-type-pairs


(type (first value-type-pairs))
;; => clojure.lang.PersistentVector


(map println value-type-pairs)

(-> "abc"
    .UpperCase)




