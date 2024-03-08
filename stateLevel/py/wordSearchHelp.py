import re

def word_search_help(grid, words):
    # Find the words in the grid
    results = {}
    for word in words:
        result = []
        found = False
        for i, row in enumerate(grid):
            for j, c in enumerate(row):
                if c == word[0]:
                    if search(grid, word, i, j):
                        result.append(f"({i + 1},{j + 1})")
                        found = True
        if found:
            results[word] = result
        else:
            results[word] = ["Not found."]
    # Print the results
    for word, result in results.items():
        print(f"{word}: {' '.join(result)}")

def search(grid, word, row, col):
    if len(word) == 1:
        return True
    c = word[1]
    if col > 0 and grid[row][col - 1] == c and search(grid, word[1:], row, col - 1):
        return True
    if col < len(grid[row]) - 1 and grid[row][col + 1] == c and search(grid, word[1:], row, col + 1):
        return True
    if row > 0 and grid[row - 1][col] == c and search(grid, word[1:], row - 1, col):
        return True
    if row < len(grid) - 1 and grid[row + 1][col] == c and search(grid, word[1:], row + 1, col):
        return True
    return False

# Read the grid of letters
grid = []
while True:
    line = input()
    if line == "-":
        break
    grid.append(line)

# Read the list of words to find
words = []
while True:
    line = input()
    if line == "-":
        break
    words.append(line.upper())

word_search_help(grid, words)