const frankenSplice=(arr1, arr2, n) => [...arr2.slice(0,n),...arr1,...arr2.slice(n)];


console.log(frankenSplice([1, 2, 3], [4, 5,], 1));
