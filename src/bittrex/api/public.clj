(ns bittrex.api.public
  (:require [cheshire.core :as json]
            [clj-http.client :as client]
            [uri.core :as uri]))

(str (uri/map->uri {:scheme "https"
                    :host "bittrex.com"
                    :path "/api/v1.1/public/getticker"
                    :query {:market "BTC-LTC"}}))

(defn- public-get
  ([tail]
   (json/parse-string (:body (client/get
                              (str (uri/map->uri {:scheme "https"
                                                  :host "bittrex.com"
                                                  :path (str "/api/v1.1/public/" tail)})))))))

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

(defn get-market-history [market]
  (public-get (str "getmarkethistory?market=" market)))
