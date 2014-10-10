(ns fibunacci.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn fib [number] 
	(last 
		(cons 0 
			(take number 
				(map last 
					(iterate 
						(fn [[a b]] [b (+' a b)])[0 1]))))))