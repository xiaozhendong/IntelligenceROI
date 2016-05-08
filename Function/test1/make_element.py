import html
import unicodedata
def make_elements(name,value,**attrs):
    keyvals=[' %s="%s"'%item for item in attrs.items()]
    attr_ste=''.join(keyvals)
    element='<{name} {attrs} >{value}</{name}>'.format(
        name=name,
        attrs=attr_ste,
        value=html.escape(value)
    )
    return element
print(make_elements('item','Albatross',size='large',quantity=6))
unicodedata.combining()