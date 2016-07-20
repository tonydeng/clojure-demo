(ns clojure-demo.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



(def zh-arab {"零" 0 "一" 1 "二" 2 "三" 3 "四" 4 "五" 5
              "六" 6 "七" 7 "八" 8 "九" 9 "十" 10 "百" 100})

;清理数据

(defn clear-data [s]
  (remove nil? (map zh-arab (clojure.string/split s #""))))

;两个元素求和

(defn sum-two [s]
  (cond
    (or (= 10 (last s))
      (= 100 (last s))) (reduce * (first s) (next s))
    :else (reduce + (first s) (next s))
    ))

(defn chinese-number [s]
  (loop [result 0
         element (clear-data s)]
    (if (empty? element)
      result
      (recur (+ result (sum-two (take 2 element))) (drop 2 element)
        ))))