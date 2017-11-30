(ns bittrex.api.public
  (:require [cheshire.core :as json]
            [clj-http.client :as client]))

(defn- public-get [tail]
  (json/parse-string (:body (client/get (str "https://bittrex.com/api/v1.1/public/" tail)))))

(defn get-markets []
  (public-get "getmarkets"))

(defn get-currencies []
  (public-get "getcurrencies"))

(defn get-ticker [market]
  (public-get (str "getticker?market=" market)))

(defn get-market-summaries []
  (public-get "getmarketsummaries"))

(defn get-market-summary [market]
  (public-get (str "getmarketsummary?market=" market)))

(defn get-order-book [market type])

(defn get-market-history [market])
