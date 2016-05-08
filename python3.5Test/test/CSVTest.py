# coding: utf-8
import csv
header=['symbol','price','date','time','change','volume']
rows=[('aa',3.6,'6/3/2014','9:30am',-0.18,188888)]
with open('my.csv','r')as f:
    f_csv = csv.reader(f)
    with open("/home/xiaozhendong/test.csv","w")as k:
        csv.writer(f_csv)
    for s in f_csv:
        print(s)
