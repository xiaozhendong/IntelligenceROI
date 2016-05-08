def combine(source,maxsize):
    parts=[]
    size=1000
    for part in source:
        parts.append(part)
        size+=len(part)
        if size>maxsize:
            yield ''.join(parts)
            parts=[]
            size=1000
    yield ''.join(parts)
def sample():
    yield 'Is '
    yield "you?"

f=open("sample.txt",'wt')
for part in combine(sample(),998):
    f.write(part)

f.write('yes')