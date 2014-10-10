(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest is-divisible-by-three
  (testing "returns true for 3"
    (is (= true (divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
	(testing "returns false for 1"
		(is (= false (divisible-by-three? 1)))))

(deftest is-divisible-by-five
	(testing "returns true for 5"
		(is (= true (divisible-by-five? 5)))))

(deftest is-divisible-by-five
	(testing "return false for 5"
		(is (= false (divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
	(testing "return true for 15"
		(is (= true (divisible-by-fifteen? 15)))))

(deftest is-divisible-by-fifteen
	(testing "return false for 15"
		(is (= false (divisible-by-fifteen? 1)))))

(deftest it-says-fizz
	(testing "returns fizz, when divisible by 3"
		(is (="fizz" (fizzbuzz 3)))))

(deftest it-says-buzz
	(testing "returns buzz when number is divisible by 5"
		(is (= "buzz" (fizzbuzz 5)))))

(deftest it-says-fizzbuzz
	(testing "returns fizzbuzz, when divisible 15"
		(is (="fizzbuzz" (fizzbuzz 15)))))

(deftest it-says-the-number
	(testing "returns the number when not divisible by 3, 5, or 15"
		(is (= 1 (fizzbuzz 1)))))