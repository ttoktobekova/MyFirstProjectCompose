package com.example.myfirstprojectcompose.ui.function

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstprojectcompose.R

@Composable
fun ProfileUserScreen() {
    var userName by remember { mutableStateOf("User") }
    var userDescription by remember { mutableStateOf("User description") }
    var isEditing by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile_user),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (isEditing) {
            TextField(
                value = userName,
                onValueChange = { userName = it },
                label = { Text("Enter your name") },
                modifier = Modifier.fillMaxWidth()
            )
        } else {
            Text(
                text = userName,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        if (isEditing) {
            TextField(
                value = userDescription,
                onValueChange = { userDescription = it },
                label = { Text("Enter description") },
                modifier = Modifier.fillMaxWidth()
            )
        } else {
            Text(
                text = userDescription,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { isEditing = !isEditing },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = if (isEditing) "Save" else "Edit Profile")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileUserScreen()
}
