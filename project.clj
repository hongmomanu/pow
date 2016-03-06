(defproject pow "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [
            [lein-npm "0.6.1"]
            [lein-cljsbuild "1.1.2"]
            ]
  :npm {:dependencies [
                       [source-map-support "0.4.0"]
                       [express "4.13.4"]
                       ]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"

  :cljsbuild {
    :builds [{:id "server"
              :source-paths ["src"]
              :compiler {
                :main pow.core
                :output-to "out/pow.js"
                :output-dir "out"
                :optimizations :simple
                :target :nodejs
                :cache-analysis true
                :source-map "out/pow.js.map"}}]}

  )
