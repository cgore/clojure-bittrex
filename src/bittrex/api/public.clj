(ns bittrex.api.public
  (:require [cheshire.core :as json]
            [clj-http.client :as client]))

(defn get-markets []
  (json/parse-string (:body (client/get "https://bittrex.com/api/v1.1/public/getmarkets"))))

(defn get-currencies []
  (json/parse-string (:body (client/get "https://bittrex.com/api/v1.1/public/getcurrencies"))))

(defn get-ticker [market])

(defn get-market-summaries []
  (json/parse-string (:body (client/get "https://bittrex.com/api/v1.1/public/getmarketsummaries"))))

(defn get-market-summary [market])

(defn get-order-book [market type])

(defn get-market-history [market])
