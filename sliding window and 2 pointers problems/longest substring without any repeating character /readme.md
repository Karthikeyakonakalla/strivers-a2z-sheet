
Created longest substring without any repeating characters problem code
we have to initialise  the left and right as zero

Have to create the datastructure like hashmap or hash array to store the last occurence of a particular character of current window current window means the longest substring without any repeating character .

we starts from first element with help of " right " variable towards end of the array until reaches the end

we have to check the whether current character already in hashmap or not if already encountered means we have to minimise the window by assigning left pointer to the next element of already encountered element

if it comes here means it does not in haashmap so we have to create new key value pair with key as that charcterr and value as its index

we have to calculate the maxlength by maximum window size by right-left+1 and maxLength

have to increment the right pointer
