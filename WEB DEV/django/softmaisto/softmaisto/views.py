#this project is made by sumit jhalidyal
import imp

from django .http import HttpResponse
from django .shortcuts import render

def index(request):
    return render(request,'index.html')
