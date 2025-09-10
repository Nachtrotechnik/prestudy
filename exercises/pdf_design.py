def pdf_designer (heights, word):
    max_height = 0 
    for char in word:
        height = heights[ord(char) - ord('a')]
        if max_height < height:
            max_height = height
    return max_height

# Test it
heights = [1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
word = "abc"
result = pdf_designer(heights, word)
print(f"Total height needed: {result}")