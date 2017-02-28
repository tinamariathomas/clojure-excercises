(def toDigits(fn [inputNumber]
               (cond 
               	(< inputNumber 1) []
               	:else (concat (toDigits (quot inputNumber 10)) [(rem inputNumber 10)]))))

(def doubleEveryOther(fn [digitList]
		(reverse (map * (reverse digitList) (cycle [1 2])))
	))
