(ns fizzbuzz.core)

(defn is-divisible-by? [number divisor]
	(zero? (mod number divisor)))

(defn divisible-by-three? [number]
	(is-divisible-by? number 3))

(defn divisible-by-five? [number]
	(is-divisible-by? number 5))

(defn divisible-by-fifteen? [number]
	(is-divisible-by? number 15))

(defn fizzbuzz [number]
	(cond 
		(divisible-by-fifteen? number) "fizzbuzz"
		(divisible-by-three? number) "fizz"
		(divisible-by-five? number) "buzz"
		:else number))