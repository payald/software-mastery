#include <stdio.h>
#include <stdlib.h>

#define smalloc(size) my_malloc(size, __FILE__, __LINE__)
#define sfree(ptr) my_free(ptr, __FILE__, __LINE__)
#define MAX 10

void* my_malloc(size_t size, const char* file, int line) {
    void* ptr = malloc(size);
    printf("Allocated %zu bytes at %p (called from %s:%d)\n", size, ptr, file, line);
    return ptr;
}

void my_free(void* ptr, const char* file, int line) {
    free(ptr);
    printf("Freed memory at %p (called from %s:%d)\n", ptr, file, line);
}

int *my_ptr=NULL;
void start(){
    int size=sizeof(int)*MAX;
    my_ptr=(int*)smalloc(size);
    printf("Allocated memory");
}

void finish(){
    sfree(my_ptr);
    my_ptr=NULL;
    printf("Freed memory");
}

int main()
{
    printf("Hello world!\n");
    start();
    printf("Do something");
    finish();
    return 0;
}
