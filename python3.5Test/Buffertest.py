from tempfile import NamedTemporaryFile
with NamedTemporaryFile('w+t',prefix='mytemp',suffix='.txt',dir='/home/xiaozhendong',delete=False) as f:
    print(f.name)
