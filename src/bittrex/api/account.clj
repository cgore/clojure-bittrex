(ns bittrex.api.account)

(defn get-balances [])

(defn get-balance [currency])

(defn get-deposit-address [currency])

(defn withdraw
  ([currency quantity address])
  ([currency quantity address payment-id]))

(defn get-order [uuid])

(defn get-order-history
  ([])
  ([market]))

(defn get-withdrawal-history
  ([])
  ([market]))

(defn get-deposit-history
  ([])
  ([market]))
