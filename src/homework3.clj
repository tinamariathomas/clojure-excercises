(def getCount (fn [ numbers, searchNumber]
	(if (== (count numbers) 1)
	 	(if ( == (nth numbers 0) searchNumber) 1 0)
		(+ (getCount (subvec numbers 0 1) searchNumber)(getCount (subvec numbers 1) searchNumber))
		)
))
