/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.prahar;

/**
 *
 * @author Ashish Katare
 */
public class searching {
    public static int binarysearch(int[] arr , int target){
        int n=arr.length;
        int st = 0;
        int end = n-1;
        
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return 0;
    }
    
    public static boolean binarysearchrec(int[] arr , int st , int end , int target){
        if(st>end)return false;
        int mid = (st+end)/2;
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]>target){
            return binarysearchrec(arr,st,mid-1,target);
        }
        else{
             return binarysearchrec(arr,mid+1,end,target);
        }
    }
    
    public static int quest1(int[] arr){
        int st = 0,end=arr.length-1;
        
        int ans = -1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid]<=arr[end]){
                ans = mid;
                end = mid-1;
            } 
            else{
                st = mid+1;
            }
        }
        return ans+1;
    }
    
    public static int quest2(int[] arr,int target){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid]==target){
                return 1;
            }
            else if(arr[mid]<arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target>=arr[st] && target<arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return 0;
    }
    
    public static void main(String args[]){
        int[] arr = {3,4,5,6,1,2};
         int st=0,end=arr.length-1;
        System.out.println(quest2(arr,7));
        
    }
    
}
