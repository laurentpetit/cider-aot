(ns cider-aot
  (:require [clojure.tools.nrepl.server :as nrepl    ]
            [clojure.tools.nrepl.ack    :as nrepl-ack]
            [cider.nrepl                :as cider    ])
  (:gen-class))

(defn -main []
  (let [server (nrepl/start-server
                 :port    0
                 :handler (nrepl-ack/handle-ack cider/cider-nrepl-handler))]
    (printf "Started nREPL server - nrepl://127.0.0.1:%d\n" (:port server))))

