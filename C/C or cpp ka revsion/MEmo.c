/* 
MEMORY MANAGEMENT IN C
1. Text segment/ code seg
2. static /global var
3.stack-- based in LIFO
4. heap-- dynamically allocation of memory


                      / -> data seg-- initlised data 
                    /
static/global var--
                    \
                      \- bss seg- uninitlised data


stack and heap both grow in opp direction
bss- block started by symbol 

fucntion used in DMA - malloc ()
                    - calloc()
                    - free()
                    - realloc()

malloc()-
memory allocation
return a void pointer  bcz it can be changed to any data type
if there will be no space then it will return null pointer

ptr= (int)*malloc(4*sizeof(int))


calloc()-
contigious memo alloc 
return also void pointer
all values to init to 0
if fails return null pointer

realloc()-
  reallocatin
  ptr= (ptt-type)* (old ptr name, new size)
free()- will free the memo

*/