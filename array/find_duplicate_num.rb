def find_repeat_number(nums)
  hs = {}
  nums.each { |e| 
    count = hs.fetch(e) { |key| 0 }
    if count == 1
      return e
    end
    hs[e] = count + 1
  }
  -1
end