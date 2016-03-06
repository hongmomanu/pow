(ns pow.core
  (:require [cljs.nodejs :as node]))

(node/enable-util-print!)

(def express (node/require "express"))

(defn say-hello! [req res]
  (println req.ip req.headers)
  (.send res (str "Hello worldssdasdasasdaasad!"req.ip)))

(defn say-test! [req res]
  (println req.ip req.headers)
  (.send res (str "Hello testsssssssssssss!"req.ip)))

(defn -main []
  (let [app (express)]
    (.get app "/" say-hello!)

    (.get app "/test" say-test!)

    (.listen app 3000 (fn []
                        (println "Server started on port 3000")))))

(set! *main-cli-fn* -main)
