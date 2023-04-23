class NativeMethods{
    static{
        Syste.loadLibrary("native Library")
    }
    public native void cmargesort();// implementation is provided by the outside
}
class nativechild{
    NativeMethods a = new NativeMethods();
    a.cmargesort(); // invoke native method
}

//important points (native keyword)
//only applicable for methods
//native methods are implemented in some other language like c/c++ also call (foreign methods)
//1.it improve performance of the system 
//2. it enable to use already available legacy non java -codes
//it completely diff from the abstract becoz we are not allowed to override this