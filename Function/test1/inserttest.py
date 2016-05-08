class safesub(dict):
    def __missing__(self,key):
        return '{'+key+'}'
name='xzd'
s='name is {name} age {age}'

print(s.format_map(safesub(vars())))

import re
re.compile()
