(def getAllNths(fn [inputString, n]
		(map #(nth inputString %1)  (range (- n 1) (count inputString) n) )		
	))
