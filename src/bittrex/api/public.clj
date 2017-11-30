(ns bittrex.api.public
  (:require [cheshire.core :as json]
            [clj-http.client :as client]))

(defn get-markets []
  (json/parse-string (:body (client/get "https://bittrex.com/api/v1.1/public/getmarkets"))))

(defn get-currencies [])

(defn get-ticker [market])

(defn get-market-summaries [])

(defn get-market-summary [market])

(defn get-order-book [market type])

(defn get-market-history [market])
