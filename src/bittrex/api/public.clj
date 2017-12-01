(ns bittrex.api.public
  (:require [cheshire.core :as json]
            [clj-http.client :as client]
            [uri.core :as uri]))

(defn- public-get
  ([tail]
   (public-get tail nil))
  ([tail query]
   (-> {:scheme "https"
        :host "bittrex.com"
        :path (str "/api/v1.1/public/" tail)
        :query query}
       uri/map->uri str client/get :body json/parse-string)))

(defn get-markets []
  (public-get "getmarkets"))

(defn get-currencies []
  (public-get "getcurrencies"))

(defn get-ticker [market]
  (public-get "getticker"
              {:market market}))

(defn get-market-summaries []
  (public-get "getmarketsummaries"))

(defn get-market-summary [market]
  (public-get "getmarketsummary"
              {:market market}))

(defn get-order-book [market type])

(defn get-market-history [market]
  (public-get "getmarkethistory"
              {:market market}))
