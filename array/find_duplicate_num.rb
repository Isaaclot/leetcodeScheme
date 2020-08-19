def find_repeat_number(nums)
  hs = Hash.new
  nums.each { |item| 
    if hs[item] == nil
      hs[item] = 1  
    else 
      count = hs[item]
      if count == 1
        return item
      end
    end
   }
   -1
end

