(def total 15)

(def total (+ total 2))

(when (> total 4)
  (println "Higher indeed"))

(defn apply-discount
  [total-value]
  (let [discount-rate 0.1
        discounted-value (* total-value discount-rate)]
      (- total-value discounted-value)))

(defn apply-discount
  [total-value]
  (if (> total-value 69)
    (let [discount-rate 0.1
          discounted-value (* total-value discount-rate)]
      (- total-value discounted-value))
    total-value))
