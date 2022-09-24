package com.smartBridge.groceryappsmart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/smartBridge/groceryappsmart/GroceryRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/smartBridge/groceryappsmart/GroceryRVAdapter$GroceryViewHolder;", "list", "", "Lcom/smartBridge/groceryappsmart/GroceryItems;", "groceryItemClickInterface", "Lcom/smartBridge/groceryappsmart/GroceryRVAdapter$GroceryItemClickInterface;", "(Ljava/util/List;Lcom/smartBridge/groceryappsmart/GroceryRVAdapter$GroceryItemClickInterface;)V", "getGroceryItemClickInterface", "()Lcom/smartBridge/groceryappsmart/GroceryRVAdapter$GroceryItemClickInterface;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GroceryItemClickInterface", "GroceryViewHolder", "app_debug"})
public final class GroceryRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.smartBridge.groceryappsmart.GroceryRVAdapter.GroceryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.smartBridge.groceryappsmart.GroceryItems> list;
    @org.jetbrains.annotations.NotNull()
    private final com.smartBridge.groceryappsmart.GroceryRVAdapter.GroceryItemClickInterface groceryItemClickInterface = null;
    
    public GroceryRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.smartBridge.groceryappsmart.GroceryItems> list, @org.jetbrains.annotations.NotNull()
    com.smartBridge.groceryappsmart.GroceryRVAdapter.GroceryItemClickInterface groceryItemClickInterface) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.smartBridge.groceryappsmart.GroceryItems> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.smartBridge.groceryappsmart.GroceryItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.smartBridge.groceryappsmart.GroceryRVAdapter.GroceryItemClickInterface getGroceryItemClickInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.smartBridge.groceryappsmart.GroceryRVAdapter.GroceryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.smartBridge.groceryappsmart.GroceryRVAdapter.GroceryViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/smartBridge/groceryappsmart/GroceryRVAdapter$GroceryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/smartBridge/groceryappsmart/GroceryRVAdapter;Landroid/view/View;)V", "deleteIV", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getDeleteIV", "()Landroid/widget/ImageView;", "nameTV", "Landroid/widget/TextView;", "getNameTV", "()Landroid/widget/TextView;", "quantityTV", "getQuantityTV", "rateTV", "getRateTV", "totalTV", "getTotalTV", "app_debug"})
    public final class GroceryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView nameTV = null;
        private final android.widget.TextView quantityTV = null;
        private final android.widget.TextView rateTV = null;
        private final android.widget.TextView totalTV = null;
        private final android.widget.ImageView deleteIV = null;
        
        public GroceryViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getNameTV() {
            return null;
        }
        
        public final android.widget.TextView getQuantityTV() {
            return null;
        }
        
        public final android.widget.TextView getRateTV() {
            return null;
        }
        
        public final android.widget.TextView getTotalTV() {
            return null;
        }
        
        public final android.widget.ImageView getDeleteIV() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/smartBridge/groceryappsmart/GroceryRVAdapter$GroceryItemClickInterface;", "", "onItemClick", "", "groceryItems", "Lcom/smartBridge/groceryappsmart/GroceryItems;", "app_debug"})
    public static abstract interface GroceryItemClickInterface {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.smartBridge.groceryappsmart.GroceryItems groceryItems);
    }
}