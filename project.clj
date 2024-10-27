(defproject org.clojure.clr/tools.nrepl "0.1.0-alpha2"
  :description "Port of https://github.com/babashka/babashka.nrepl to ClojureCLR"
  :url "https://github.com/clojure/clr.tools.nrepl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure.clr/tools.reader "1.4.2"]]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]  
  :min-lein-version "2.0.0"
  :main clojure.tools.nrepl
  :plugins [[lein-clr "0.2.0"]]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo/"
                                    :sign-releases  false}]]	 
  :clr {:cmd-templates  {:clj-exe   [%1]
                       :clj-dep   ["dotnet" ["target/clr/clj/Debug 4.0" %1]]}
      :main-cmd      [:clj-exe "/usr/bin/clojure.main"]
      })
