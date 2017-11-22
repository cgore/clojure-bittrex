(ns bittrex.api.market)

(defn buy-limit [market quantity rate])

(defn sell-limit [market quantity rate])

(defn cancel [uuid])

(defn get-open-orders
  ([])
  ([market]))
