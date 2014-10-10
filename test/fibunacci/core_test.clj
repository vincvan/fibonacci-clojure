(ns fibonacci.core-test
  (:require [clojure.test :refer :all]
            [fibonacci.core :refer :all]))

(deftest fibonacci-0
	(testing "returns 0 for Fibonacci of 0"
		(is (= 0 (fib 0 )))))

(deftest fibonacci-1
	(testing "returns 1 for Fibonacci of 1"
		(is (= 1 (fib 1 )))))

(deftest fibonacci-3
	(testing "return 2 for fibonacci of 3"
		(is (= 2 (fib 3)))))

(deftest fibonacci-10
	(testing "return 55 for fibonacci of 10"
		(is (= 55 (fib 10)))))