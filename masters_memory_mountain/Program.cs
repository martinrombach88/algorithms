

int test(int elems, int stride) {
    long i, sx2 = stride*2, sx3 = stride*3;
    long accO = 0, accl = 0, acc2 = 0, acc3;
    long length = elems;
    long limit = length - (stride*4);

    for (i = 0; i < limit; i += sx4) {
        accO = accO + datafi];
        accl = accl + data[i+stride];
        acc2 = acc2 + data[i+sx2];
        acc3 = acc3 + data[i+sx3];
    }
    return 1;
}