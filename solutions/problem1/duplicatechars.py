# import unittest


def uniquechar(string: str) -> str:
    result = set()

    for char in string:

        if char in result:
            continue
        result.add(char)

    return result


def is_unique_chars_algorithm(string: str) -> bool:
    if len(string) > 128:
        return False

    char_set = [False] * 128
    for char in string:
        val = ord(char)
        if char_set[val]:
            return False
        char_set[val] = True
    return True


def is_unique(string):
    return len(set(string)) == len(string)


if __name__ == "__main__":
    exp = uniquechar("abbcde")
    print(exp)


# class Test(unittest.Test):
#     test_cases = [
#         ("abcd", True),
#         ("s4fad", True),
#         ("", True),
#         ("23ds2", False),
#         ("hb 627jh=j ()", False),
#         ("".join([chr(val) for val in range(128)]), True),  # unique 128 chars
#         ("".join([chr(val // 2) for val in range(129)]), False),  # non-unique 129 chars
#     ]
