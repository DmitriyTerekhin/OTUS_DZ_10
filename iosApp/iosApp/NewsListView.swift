import SwiftUI
import shared

struct NewsListView: View{
    @ObservedObject var model = NewsListModel()
    
    var body: some View {
        NavigationView {
            List(model.items, id: \.self) { item in
                VStack {
                    Text(item.title ?? "").font(.title)
                    Text(item.content ?? "")
                }
            }.onAppear{
                model.loadNews()
            }.navigationBarTitle("News", displayMode: .inline)
        }
    }
}
