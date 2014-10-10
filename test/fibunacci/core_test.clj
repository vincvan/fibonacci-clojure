(ns fibunacci.core-test
  (:require [clojure.test :refer :all]
            [fibunacci.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest fibonacci-0
	(testing "returns 0 for Fibunacci of 0"
		(is (= 0 (fibu 0 )))))

(deftest fibonacci-1
	(testing "returns 1 for Fibunacci of 1"
		(is (= 1 (fibu 1 )))))