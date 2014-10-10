(ns fibonacci.core)

(defn fib [number] 
	(last 
		(cons 0 
			(take number 
				(map last 
					(iterate 
						(fn [[a b]] [b (+' a b)])[0 1]))))))