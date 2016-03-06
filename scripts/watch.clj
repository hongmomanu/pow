(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'pow.core
   :output-to "out/pow.js"
   :output-dir "out"})
