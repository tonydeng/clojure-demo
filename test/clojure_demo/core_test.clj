(ns clojure-demo.core-test
  (:require [clojure.test :refer :all]
            [clojure-demo.core :refer :all]))

(deftest chinese-number-test
  (testing "Test Chinese Number."
    (= 0   (chinese-number "零"))
    (= 1   (chinese-number "一"))
    (= 10  (chinese-number "十"))
    (= 12  (chinese-number "十二"))
    (= 20  (chinese-number "二十行"))
    (= 34  (chinese-number "三十四"))
    (= 567 (chinese-number "五百六十七"))
    (= 809 (chinese-number "八百零九回"))
    (print (chinese-number "九百九十五"))
    ))

