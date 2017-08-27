(set-env!
 :source-paths #{"src/clj" "src/cljs" "content"}
 :resource-paths #{"public"}
 :dependencies '[[perun "0.3.0" :scope "test"]
                 [hiccup "1.0.5"]
                 [pandeiro/boot-http "0.7.0"]
                 [org.clojure/clojure "1.8.0"]         ;; !!! Might conflict perun
                 [org.clojure/clojurescript "1.9.473"] ;; add CLJS
                 [adzerk/boot-cljs "1.7.228-2"]
                 [pandeiro/boot-http "0.7.6"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [adzerk/boot-reload "0.5.1"]
                 [adzerk/boot-cljs-repl "0.3.3"]
                 [com.cemerick/piggieback "0.2.1"]     ;; needed by bREPL
                 [weasel "0.7.0"]])


(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-cljs :refer [cljs]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])

(deftask build
  "Build site."
  []
  (comp (markdown)
        (render :renderer 'site.core/page :out-dir "public")
        (cljs)
        (target)))


(deftask dev
  "Build for development."
  []
  (comp (serve :dir "target/public")
        (watch)
        (markdown)
        (render :renderer 'site.core/page :out-dir "public")
        (reload)
        (cljs)
        (target)))


